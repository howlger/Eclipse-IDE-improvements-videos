type Colors = "red" | "yellow" | "green" | "black";

type RGB = [red: number, green: number, blue: number];

const palette = {
    red:    [255, 0, 0],
    yellow: "#ffff00",
    green:  [0, 0, 255],
    black:  [0, 0, 0],
} satisfies Record<Colors, string | RGB>;

palette.black.fill(8);
palette.yellow.toUpperCase();