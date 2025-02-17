public class patternA_Z {
    public static void printLetter(char letter) {
        int rows = 7, cols = 5;
        char[][] pattern = new char[rows][cols];

        // Initialize pattern with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                pattern[i][j] = ' ';
            }
        }

        switch (letter) {
            case 'A':
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (j == 0 || j == cols - 1 ||
                                (i == 0 && j > 0 && j < cols - 1) ||
                                i == rows / 2) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'B':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows - 1 || i == rows / 2) {
                        for (int j = 0; j < cols - 1; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    if (i > 0 && i < rows - 1) {
                        pattern[i][cols - 1] = '*';
                    }
                }
                break;

            case 'C':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows - 1) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'D':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows - 1) {
                        for (int j = 0; j < cols - 1; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    pattern[i][cols - 1] = '*';
                }
                break;

            case 'E':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows - 1 || i == rows / 2) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'F':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows / 2) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'G':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows - 1) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    if (i >= rows / 2) {
                        pattern[i][cols - 1] = '*';
                    }
                    if (i == rows / 2) {
                        for (int j = cols / 2; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'H':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                    if (i == rows / 2) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'I':
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (i == 0 || i == rows - 1 || j == cols / 2) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'J':
                for (int i = 0; i < rows; i++) {
                    if (i == 0) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    if (i < rows - 1) {
                        pattern[i][cols / 2] = '*';
                    }
                    if (i == rows - 1) {
                        for (int j = 0; j < cols / 2; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'K':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i <= rows / 2) {
                        pattern[i][i] = '*';
                    } else {
                        pattern[i][rows - 1 - i] = '*';
                    }
                }
                break;

            case 'L':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == rows - 1) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'M':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                    if (i < rows / 2) {
                        pattern[i][i] = '*';
                        pattern[i][cols - 1 - i] = '*';
                    }
                }
                break;

            case 'N':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                    if (i < cols) {
                        pattern[i][i] = '*'; // Diagonal from top-left to bottom-right
                    }
                }
                break;

            case 'O':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                    if (i == 0 || i == rows - 1) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;
            case 'P':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows / 2) {
                        for (int j = 0; j < cols - 1; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    if (i < rows / 2) {
                        pattern[i][cols - 1] = '*';
                    }
                }
                break;

            case 'Q':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                    if (i == 0 || i == rows - 2) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    if (i == rows - 1) {
                        pattern[i][cols - 2] = '*';
                    }
                }
                break;

            case 'R':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    if (i == 0 || i == rows / 2) {
                        for (int j = 0; j < cols - 1; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    if (i < rows / 2) {
                        pattern[i][cols - 1] = '*';
                    } else {
                        pattern[i][i - rows / 2 + 1] = '*';
                    }
                }
                break;

            case 'S':
                for (int i = 0; i < rows; i++) {
                    if (i == 0 || i == rows / 2 || i == rows - 1) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                    if (i < rows / 2) {
                        pattern[i][0] = '*';
                    }
                    if (i > rows / 2) {
                        pattern[i][cols - 1] = '*';
                    }
                }
                break;

            case 'T':
                for (int i = 0; i < rows; i++) {
                    if (i == 0) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    } else {
                        pattern[i][cols / 2] = '*';
                    }
                }
                break;

            case 'U':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                    if (i == rows - 1) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    }
                }
                break;

            case 'V':
                for (int i = 0; i < rows - 1; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                }
                pattern[rows - 1][cols / 2] = '*';
                break;

            case 'W':
                for (int i = 0; i < rows; i++) {
                    pattern[i][0] = '*';
                    pattern[i][cols - 1] = '*';
                    if (i >= rows / 2) {
                        pattern[i][i - rows / 2 + 1] = '*';
                        pattern[i][cols - (i - rows / 2 + 2)] = '*';
                    }
                }
                break;

            case 'X':
                for (int i = 0; i < Math.min(rows, cols); i++) { // Ensures we handle square matrix
                    pattern[i][i] = '*'; // Left to right diagonal
                    pattern[i][cols - 1 - i] = '*'; // Right to left diagonal
                }
                break;

            case 'Y':
                for (int i = 0; i < rows / 2; i++) {
                    pattern[i][i] = '*';
                    pattern[i][cols - 1 - i] = '*';
                }
                for (int i = rows / 2; i < rows; i++) {
                    pattern[i][cols / 2] = '*';
                }
                break;

            case 'Z':
                for (int i = 0; i < rows; i++) {
                    // Fill the first and last rows
                    if (i == 0 || i == rows - 1) {
                        for (int j = 0; j < cols; j++) {
                            pattern[i][j] = '*';
                        }
                    } else {
                        // Fill the diagonal from top-right to bottom-left
                        pattern[i][cols - 1 - i] = '*';
                    }
                }
                break;

            // More letters go here...

            default:
                System.out.println("Letter " + letter + " is not yet implemented.");
                return;
        }

        // Print the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.println("\n" + letter + ":");
            printLetter(letter);
        }
    }
}
