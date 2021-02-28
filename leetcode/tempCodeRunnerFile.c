char *str = strs[0];
    int len;
    int j;
    for(int i = 1; i < strsSize; i++) {
        len = strlen(strs[i]);
        for(j = 0; j < len; j++) {
            if(str[j] != strs[i][j]) {
                break;
            }
        }
    }
    char *p = (char *)malloc(j + 1);
    int i;
    for(i = 0; i < j; i++) {
        p[i] = str[i];
    }
    p[i] = '\0';
    