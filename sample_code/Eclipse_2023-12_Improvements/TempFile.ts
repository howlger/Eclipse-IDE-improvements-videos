declare global {
	export interface SymbolConstructor {
		readonly dispose: symbol;
	}
}

export interface Symbol {
	readonly [Symbol.dispose]: symbol;
}

export class TempFile {
	#path: string;

	constructor(path: string) {
		this.#path = path;
	}

	[Symbol.dispose]() {
		// Here you can add the logic to delete the file
		// For example, you can use the fs module in Node.js to delete the file
		// fs.unlinkSync(this.#path);
	}

	write(content: String): void {
		console.log(content)
	}

	getPath(): string {
		return this.#path;
	}
}