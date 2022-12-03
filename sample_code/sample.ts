type Colors = "red" | "yellow" | "green" | "black";

type RGB = [red: number, green: number, blue: number];

const palette: Record<Colors, string | RGB> = {
    red:    [255, 0, 0],
    yellow: "#ffff00",
    green:  [0, 0, 255],
    black:  [0, 0, 0],
};

