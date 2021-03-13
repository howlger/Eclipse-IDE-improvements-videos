import * as utility from './utility.js';
main();

/**
 * @see foo
 * @see utility.foo
 */
function main() {
	foo();
	utility.foo();
}

/** Hello, down here!  */
function foo() {
	//...
}