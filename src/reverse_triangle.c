#include <stdio.h>


int main(void)
{
	
	void reverse_triangle(int);

	reverse_triangle(20);

	return 0;
}

void reverse_triangle(int steps)
{
	
	int spaces;
	char pound = '#';

	for (int i = 0; i < steps; i++) {

		spaces = steps - i;
		for (int j = 0; j < steps; j++) {

			// prints the spaces
			if ( j < spaces )	
				printf(" ");
			// prints the pound sign
			else
				printf("%c", pound);
		}

		printf("\n");
	}
}
