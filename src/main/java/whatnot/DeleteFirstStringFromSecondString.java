package whatnot;

public class DeleteFirstStringFromSecondString {

    public static void main(String[] args) {
        DeleteFirstStringFromSecondString deleteFirstStringFromSecondString = new DeleteFirstStringFromSecondString();
        String dirtyCharacter = "aeiou";
        String inputString = "We are students";
        deleteFirstStringFromSecondString.removeDirtyCharatcters(dirtyCharacter, inputString);
    }

    private void removeDirtyCharatcters(String dirtyCharacter, String inputString) {
        int[] dirtyCharacterArray = new int[256];
        for (int i = 0; i < dirtyCharacter.length(); i++) {
            dirtyCharacterArray[dirtyCharacter.charAt(i)]++;

        }
        char[] removedArr = inputString.toCharArray();
        int res_index = 0;
        int in_index = 0;

        while (in_index < inputString.length()) {

            if (dirtyCharacterArray[removedArr[in_index]] == 0) {
                removedArr[res_index] = removedArr[in_index];
                res_index++;
            }
            in_index++;

        }

       inputString=String.valueOf(removedArr);
        System.out.println(inputString.substring(0,res_index));

        }

    }

