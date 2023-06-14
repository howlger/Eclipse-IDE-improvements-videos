function log(originalMethod: any, context: ClassMethodDecoratorContext) {
    return function replacementMethod(this: any, ...args: any[]) {
        console.log(`LOG: Entering method '${String(context.name)}'`)
        const result = originalMethod.call(this, ...args);
        console.log(`LOG: Exiting method '${String(context.name)}'`)
        return result;
    }
}

class Person {
	
    name: string;

    constructor(name: string) {
        this.name = name;
    }

    @log
    greet() {
        console.log(`Hello, my name is ${this.name}.`);
    }

}