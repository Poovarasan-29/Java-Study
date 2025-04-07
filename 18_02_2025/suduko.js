const suduko = [
  ["5", "3", ".", ".", "7", ".", ".", ".", "."],
  ["6", ".", ".", "1", "9", "5", ".", ".", "."],
  [".", "9", "8", ".", ".", ".", ".", "6", "."],
  ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
  ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
  ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
  [".", "6", ".", ".", ".", ".", "2", "8", "."],
  [".", ".", ".", "4", "1", "9", ".", ".", "5"],
  [".", ".", ".", ".", "8", ".", ".", "7", "9"],
];

function isValidSuduko(suduko) {
  const lenOfSuduko = suduko.length;
  for (let i = 0; i < lenOfSuduko; i++) {
    for (let j = i; j < lenOfSuduko; j++) {
      if (suduko[i][j] !== ".") {
        for (let k = j + 1; k < lenOfSuduko; k++) {
          if (suduko[i][j] == suduko[i][k] || suduko[i][j] == suduko[k][j]) {
            return false;
          }
        }
      }
    }
  }
  return true;
}

const result = isValidSuduko(suduko);
console.log(result);
