syntax class = function (ctx) {
  let name = ctx.next().value;
  let bodyCtx = ctx.next().value.inner();

  // default constructor if none specified
  let construct = #`function ${name} () {}`;
  let result = #``;
  for (let item of bodyCtx) {
    if (item.isIdentifier('constructor')) {
      construct = #`
        function ${name} ${bodyCtx.next().value}
        ${bodyCtx.next().value}
      `;
    } else {
      result = result.concat(#`
        ${name}.prototype.${item} = function
            ${bodyCtx.next().value}
            ${bodyCtx.next().value};
      `);
    }
  }
  return construct.concat(result);
}
class Droid {
  constructor(name, color) {
    this.name = name;
    this.color = color;
  }

  rollWithIt(it) {
    return this.name + " is rolling with " + it;
  }
}

