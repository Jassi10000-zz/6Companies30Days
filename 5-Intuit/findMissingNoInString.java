class findMissingNoInString{
    public int missingNumber(String str) {
        if(str.length() == 1) {
            return -1;
        }

        for(int i = 1; i <= Math.min(6, str.length()); i++) {

            int curr = Integer.parseInt(str.substring(0,i));
            int ans = miss(str.substring(i), curr, false);
            if(ans != -1) {
                return ans;
            }
        }
        return -1;

    }

    private static int miss(String str, int prev, boolean bool) {
        if(str.equals("")) {
            if(bool) {
                return 0;
            }
            return -1;
        }
        if(bool) {
            String curr = "" + (prev + 1);
            if(str.startsWith(curr)) {
                return miss(str.substring(curr.length()), prev + 1, bool);
            } else {
                return -1;
            }
        } else {
            String curr = "" + (prev + 1);
            if(str.startsWith(curr)) {
                return miss(str.substring(curr.length()), prev + 1, bool);
            } else {
                curr = (prev + 2) + "";
                if(str.startsWith(curr)) {
                    if( miss(str.substring(curr.length()), prev + 2, true) == 0) {
                        return prev + 1;
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
        }
    }
}