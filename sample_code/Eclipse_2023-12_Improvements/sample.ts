import { TempFile } from "./TempFile";

const path = ".temp_file"

export function withUsing() {
    using file = new TempFile(path);

    // use file...
    file.write("...")

    // `Symbol.dispose` is called implicitly at the end of the scope
}

export function withoutUsing() {
	const file = new TempFile(path);
	try {
		// use file...
		file.write("...")
	}
	finally {
		file[Symbol.dispose]();
	}
}