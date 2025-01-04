const numbers = ["2", "6", "7", "8"];
numbers.forEach(num1 => {
    numbers.forEach(num2 => {
        numbers.forEach(num3 => {
            numbers.forEach(num4 => {
                numbers.forEach(num5 => {
                    console.log(`${num1}${num2}${num3}${num4}${num5}`);
                });
            });
        });
    });
});
