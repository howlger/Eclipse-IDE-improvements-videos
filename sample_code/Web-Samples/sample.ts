// Correct override checks on computed properties - https://devblogs.microsoft.com/typescript/announcing-typescript-5-6/#correct-override-checks-on-computed-properties
const sample= Symbol("sample");
class Base {}
class Derived extends Base {

	override [sample]() {}
//	         ~~~~~~~~
//	         This member cannot have an 'override' modifier because it is not declared in the base class 'Base'.

}


// Checks for never-initialized variables - https://devblogs.microsoft.com/typescript/announcing-typescript-5-7/#checks-for-never-initialized-variables
let result: number
if (Math.random() < 0.5) {
	result= 0
} else {
	// ...
	// forgot to assign to 'result'
}
console.log(result);
//          ~~~~~~
//          Variable 'result' is used before being assigned.