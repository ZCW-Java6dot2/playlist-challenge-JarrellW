package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int upward = 0;
        int downward = 0;

        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection)){
                break;
            }
            if (i + 1 > playList.length - 1) {
                i = -1;
            }
            downward += 1;
        }
        for (int i = startIndex; i >= 0; i--) {
            if (playList[i].equals(selection)) {
                break;
            }

            if (i - 1 < 0) {
                i = playList.length;
            }
            upward += 1;
        }

        if (downward > upward) {
            return upward;
        } else {
            return downward;
        }
    }
}
