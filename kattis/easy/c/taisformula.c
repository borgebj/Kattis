#include <stdio.h>

// trapezoid integral formula for N points
double trap(double x[], double y[], int n) {
    double area = 0.0;
    
    // n - 1 trapezoids
    for (int i = 0; i < n - 1; i++) {
        area += (y[i] + y[i + 1]) * (x[i + 1] - x[i]) / 2.0;
    }
    return area / 1000;
}

int main() {
    int n;
    double x[n]; // time
    double y[n]; // glucose
    scanf("%d", &n);
    
    for (int i = 0; i < n; i++) {
        scanf("%lf", &x[i]);
        scanf("%lf", &y[i]);
    }
    double area = trap(x, y, n);
    printf("%lf", area);
    
    return 0;
}

/* 
Example input

3
1000 2.0
2000 12.0
3000 22.0

output:
24
*/
