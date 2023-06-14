// @ts-check

/** (a)
 * @overload
 * @param {string} value
 * @return {void}
 */

/** (b)
 * @overload
 * @param {number} value
 * @param {number} [maximumFractionDigits]
 * @return {void}
 */

/**
 * @param {string | number} value
 * @param {number} [maximumFractionDigits]
 */
function printValue(value, maximumFractionDigits) {
    if (typeof value === "number") {
        const formatter = Intl.NumberFormat("en-US", {
            maximumFractionDigits,
        });
        value = formatter.format(value);
    }
    console.log(value);
}

printValue("...");      // ✔ (a)
printValue(1.23);       // ✔ (b)
printValue(1.23, 2);    // ✔ (b)
//printValue("...", 123); // ✖ error: neither (a) nor (b)

//var n = /** @satisfies {number} */ ( "123" );