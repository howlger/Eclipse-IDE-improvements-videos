
// New quick fixes: Add missing/optional parameters
function someHelperFunction(abc: string) {}
 
function someFunction(abc: string, def: string, xyz: string) {
	return someHelperFunction(abc, def, xyz);
}