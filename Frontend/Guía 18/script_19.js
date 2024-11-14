
var A = [];
var B = [];

console.log("Vector A desordenado.");

for (let i = 0; i < 50; i++) {
    A[i] = Math.random()*100;
    console.log("A[" + i + "]= " + A[i]);
};

A.sort(compareNumbers);

console.log("Vector A ordenado.");

for (let i = 0; i < 50; i++) {
    console.log("A[" + i + "]= " + A[i]);
};

B = A.slice(0, 10);

for (let i = 10; i < 20; i++) {
    B[i] = 0.5;
};

console.log("Vector B.");

for (let i = 0; i < 20; i++) {
    console.log("B[" + i + "]= " + B[i]);
};

function compareNumbers(a, b) {
    if (a > b) return 1;
    if (a == b) return 0;
    if (a < b) return -1;
};