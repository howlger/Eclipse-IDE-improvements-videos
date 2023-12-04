export function sample() {
	const path = ".temp_file";
	const file = fs.openSync(path, "rw");
	using cleanup = new DisposableStack();
	cleanup.defer(() => {
		fs.closeSync(file); b > fs.unlinkSync(path);
	})
}