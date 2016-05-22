syntax cond = function (ctx) {
  let bodyCtx = ctx.next().value.inner(); 

  let result = #``;
  for (let stx of bodyCtx) { 
    if (stx.isKeyword('case')) { 
      let test = bodyCtx.next('expr').value;
      // eat `:`
      bodyCtx.next();
      let r = bodyCtx.next('expr').value;
      result = result.concat(#`${test} ? ${r} :`);
    } else if (stx.isKeyword('default')) {
      // eat `:`
      bodyCtx.next();
      let r = bodyCtx.next('expr').value;
      result = result.concat(#`${r}`);
    } else {
      throw new Error('unknown syntax: ' + stx);
    }
  }
  return result;
}

let x = null;

let realTypeof = cond {
  case x === null: 'null'
  case Array.isArray(x): 'array'
  case typeof x === 'object': 'object'
  default: typeof x
}

