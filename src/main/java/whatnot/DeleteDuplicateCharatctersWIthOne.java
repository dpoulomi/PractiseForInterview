package whatnot;

public class DeleteDuplicateCharatctersWIthOne {
    public static void main(String[] args) {
        String str = "google";
        DeleteDuplicateCharatctersWIthOne deleteDuplicateCharatctersWIthOne = new DeleteDuplicateCharatctersWIthOne();
        deleteDuplicateCharatctersWIthOne.deleteDuplicateCharacters(str);
    }

    private void deleteDuplicateCharacters(String str) {

        int ocurrence[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (ocurrence[str.charAt(i)] == 0) {
                ocurrence[str.charAt(i)]++;
            }
        }
        int res_index = 0;
        int in_index = 0;
        char arr[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ocurrence[str.charAt(i)] >= 1) {
                arr[res_index] = arr[in_index];
                ocurrence[str.charAt(i)] = 0;
                res_index++;
            }
            in_index++;

        }
        System.out.println(String.valueOf(arr).substring(0, res_index));


    }
}