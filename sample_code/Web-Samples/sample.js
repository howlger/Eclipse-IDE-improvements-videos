// @ts-check

// Correct override checks on computed properties - https://devblogs.microsoft.com/typescript/announcing-typescript-5-6/#correct-override-checks-on-computed-properties
const sample = Symbol("sample");
class Base {}
class Derived extends Base {

	/** @override */ [sample]() {}
//	                 ~~~~~~~~
//	                 This member cannot have a JSDoc comment with an '@override' tag because it is not declared in the base class 'Base'.

}