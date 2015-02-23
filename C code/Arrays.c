/*
 * Arrays.c
 *
 *  Created on: 2015年2月13日
 *      Author: Leon
 */

void reverse(char *str) {
	char* end = str;
	char tmp;
	if (str) {
		while (*end) {
			++end;
		}
		--end;
		while (str < end) {
			tmp = *str;
			*str++ = *end;
			*end-- = tmp;
		}
	}
}

int replaceSpaces(char *str, int length) {
	int i = 0, count = 0;
	for(i = 0; i < length; i++) {
		if (str[i] == ' ') {
			count += 3;
		} else {
			count++;
		}
	}
	str[count] = '\0';
	for(i = length - 1; i >= 0; i--) {
		if (str[i] == ' ') {
			str[count - 1] = '0';
			str[count - 2] = '2';
			str[count - 3] = '\%';
			count -= 3;
		} else {
			str[count - 1] = str[i];
			count--;
		}
	}
	return 0;
}
