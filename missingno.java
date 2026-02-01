class 
function missingNum(arr) {
    const n = arr.length + 1;

    // Iterate from 1 to n and check
    // if the current number is present
    for (let i = 1; i <= n; i++) {
        let found = false;
        for (let j = 0; j < n - 1; j++) {
            if (arr[j] === i) {
                found = true;
                break;
            }
        }

        // If the current number is not present
        if (!found)
            return i;
    }
    return -1;
}

// drvier code 
const arr = [8, 2, 4, 5, 3, 7, 1];
console.log(missingNum(arr));