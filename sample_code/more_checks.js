class { missingName = true }
class Doubler extends C extends C { }
class Trebler extends C,C,C {

    // await in static block
    static {
        for await (const x of [1,2,3]) { console.log(x) }
        return null;
    }

    // modifier mistakes
    static constructor() { }
    async constructor() { }
    async async extremelyAsync() { }
    async static oorder(){ }
    export cantExportMethod() { }

    // accessor mistakes
    get incorporeal();
    get parametric(n) { return 1 }
    set invariant() { }
    set binary(fst, snd) { }
    set variable(...n) { }

    // other
    "constructor" = 16;
}

// #private mistakes
#unrelated
junk.#m

// modifier mistakes
export export var extremelyExported = 10
export static var staticExport = 1
async export function oorder(x = 1) { return x }
async async function extremelyAsync() {}
async class CantAsyncClass {}
async const cantAsyncConst = 2
async import 'assert'
async export { CantAsyncClass }
export import 'fs'
export export { C }
function nestedExports() {
    export { staticParam }
    import 'fs'
    export default 12
}
function outerStaticFunction() {  static function staticFunction() { } }
const noStaticLiteralMethods = { static m() { } }

// rest parameters
function restMustBeLast(...x, y) { }
function restCantHaveInitialiser(...x = [1,2,3]) { }
function restCantHaveTrailingComma (...x,) { }
;({ ...{} } = {})
const { ...rest, e: episode, m: mission } = doom
const { e: eep, m: em, ...rest: noRestAllowed } = doom
const { e: erp, m: erm, ...noInitialiser = true } = doom

// left-over parsing
var;
var x = 1 || 2 ?? 3;
var x = 2 ?? 3 || 4;
const arr = x => x + 1;
a?.`length`;
const o = {
    [console.log('oh no'),2]: 'hi',
    #noPrivate: 3,
    export cantExportProperties: 4,
    cantHaveQuestionMark?: 1,
    definitely!,
    definiteMethod!() { return 13 },
}
const noAssignment = {
    assignment = 1,
}
var noTrailingComma = 1,;
class MissingExtends extends { }

// let/const mistakes
const { e: ee };
const noInit;
let let = 15;
if (true) let onlyBlockLet = 17;
if (true) const onlyBlockConst = 18;

// loop mistakes
for (async of l) { console.log(x) }
for (const cantHaveInit = 1 of [1,2,3]) { console.log(cantHaveInit) }
for (const cantHaveInit = 1 in [1,2,3]) { console.log(cantHaveInit) }
for (let y, x of [1,2,3]) { console.log(x) }
for (let y, x in [1,2,3]) { console.log(x) }

// duplication mistakes
var b
switch (b) {
    case false: console.log('no')
    default: console.log('yes')
    default: console.log('wat')
}
try { throw 2 } catch (e) { const e = 1 }
try { throw 20 } catch (e = 0) { }
label: for (const x in [1,2,3]) {
    label: for (const y in [1,2,3]) { break label; }
}

// labels
function crossFunctionBoundary() {
    outer: for(;;) {
        function test() { break outer }
        test()
    }
}
function continueIterationOnly(x) {
    outer: switch (x) {
        case 1: continue outer
    }
}
function jumpToLabelOnly(x) {
    break jumpToLabelOnly
}
for (;;) {
    break toplevel
    continue toplevel
}
break
continue

// other weirdness
export let noMeta = import.metal
function foo() { new.targe }
const nullaryDynamicImport = import()
const nullaryDynamicImport = import('1', '2', '3')
const spreadDynamicImport = import(...[])
return;