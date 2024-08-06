#include <stdio.h>
#include <math.h>

int main() {
    int n;
    double g = 9.81;
    scanf("%d", &n);
    
    for (int i = 0; i < n; i++) {
        double v, o, x, h1, h2;
        scanf("%lf %lf %lf %lf %lf", &v, &o, &x, &h1, &h2);
        
        double angle = (o * M_PI / 180); // degrees to radians
        
        // calculate angles in radians
        double cosine = cos(angle);
        double sine = sin(angle);
        
        // time based on distance to wall and velocity
        double time = x / (v * cosine);
        
        // calculate height at time 't'
        double height = v * time * sine - 0.5 * g * pow(time, 2);        
        
        // safety-boundaries
        double lower_safe = (h1 + 1.0);
        double upper_safe = (h2 - 1.0);
        
        if (lower_safe <= height && height <= upper_safe) {
            printf("Safe\n");
        } else {
            printf("Not Safe\n");
        }
    }
    return 0;
}

/*
        printf("velocity: %.2lf, Radians: %.2lf, cosine: %.2lf time: %.2lf, height: %.2lf, h1: %.2lf, h2: %.2lf\n", 
        v, angle, cosine, time, height, h1, h2);
*/

/*
Example input

11
19 45 20 9 12
20 45 20 9 12
25 45 20 9 12
20 43 20 9 12
20 47.5 20 9 12
20 45 17 9 12
20 45 24 9 12
20 45 20 10 12
20 45 20 9 11
20 45 20 9.0 11.5
20 45 18.1 9 12

output:
Not Safe
Safe
Not Safe
Not Safe
Not Safe
Not Safe
Not Safe
Not Safe
Not Safe
Safe
Safe
*/
