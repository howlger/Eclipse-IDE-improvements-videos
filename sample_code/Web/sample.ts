// TypeScript 6.0 support

// e.g. Less Context-Sensitivity on this-less Functions
declare function callIt<T>(obj: {
    produce: (x: number) => T,
    consume: (y: T) => void,
}): void;
callIt({
    consume(y) { return y.toFixed(); },
    //                  ~
    // No more: ⚠️ 'y' is of type 'unknown'.

    produce(x: number) { return x * 2; },
});