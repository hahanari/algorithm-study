package IO;

import java.util.ArrayList;

public class Solution {

    ArrayList<String> draft = new ArrayList<>();
    ArrayList<String> permantStorage = new ArrayList<>();

    public String[] solution(String[] record) {

        String[] answer = {};

        for (String rec : record) {

            String[] splitList = rec.split(" ");

            String command = splitList[0];
            String email = "";
            if(splitList.length == 2)
                email = rec.split(" ")[1];

            switch (command) {
                case "RECEIVE":
                    receiveEmail(email);
                    break;
                case "DELETE":
                    deleteEmail();
                    break;
                case "SAVE":
                    saveEmail();
                    break;
                default:
                    break;
            }
        }

        int i = 0;
        answer = new String[permantStorage.size()];

        for(String emailAdress : permantStorage) {
            answer[i] = emailAdress;
            i++;
        }

        return answer;
    }

    private void receiveEmail(String email) {

        draft.add(email);

    }
    private void deleteEmail() {

        int draftSize = draft.size();

        if(draftSize != 0)
            draft.remove(draftSize-1);

    }
    private void saveEmail() {

        permantStorage.addAll(draft);
        draft.clear();

    }

}
