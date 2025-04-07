const merge = (num1, num2) => {
  num1.push(...num2);
  num1.sort((a, b) => a - b);
  const len = num1.length;
  const mid = Math.floor(len / 2);
  if (len & (1 == 0)) {
    return (num1[mid] + num1[mid - 1]) / 2;
  }
  return num1[mid];
};

const num1 = [1, 3, 4];
const num2 = [4, 2, 5, 2, 3, 4];

console.log(merge(num1, num2));
