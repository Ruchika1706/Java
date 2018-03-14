#include<stdio.h>
#include<stdlib.h>
int main(){
	int row, columns;
	printf("Enter the number of rows");
	scanf("%d",&row);
	printf("Enter the number of columns");
	scanf("%d",&columns);
	//Create an array of pointers
	/*First Way*/
	int *arr[row];
	int i=0,j=0;
	for(i=0;i<row;i++){
		arr[i] = (int*)malloc(sizeof(int)*columns);
	}
	for(i=0;i<row;i++){
		for(j=0;j<columns;j++){
			arr[i][j] = i+j;
		}
	}
	for(i=0;i<row;i++){
		for(j=0;j<columns;j++){
			printf("%d",arr[i][j]);
			printf(" ");
		}
		printf("\n");
	}
	for(i=0;i<row;i++){
		free(arr[i]);
	}
//	free(arr);




	/* Second Wayi double pointer*/
	int **c = (int**)malloc(row*sizeof(int *));
	for(i=0;i<row;i++){
	 	c[i] = (int*)malloc(columns*sizeof(int));
	}
	for(i=0;i<row;i++){
		for(j=0;j<columns;j++){
			c[i][j] = i+j;
		}
	}
	printf("\n");
	for(i=0;i<row;i++){
		for(j=0;j<columns;j++){
			printf("%d",c[i][j]);
			printf(" ");
		}
		printf("\n");
	}
	for(i=0;i<row;i++){
		free(c[i]);
	}
	free(c);
	
	
	
	return 0;
}
