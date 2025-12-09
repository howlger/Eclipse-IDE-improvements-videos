// Support for TypeScript 5.9, e.g. import defer ...
import defer * as util from "./sample-util.js";

// No side effects have occurred yet

// ...

// As soon as `specialConstant` is accessed, the contents of the `feature`
// module are run and side effects have taken place.
console.log(util.specialConstant); // 42