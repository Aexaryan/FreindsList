package com.alexander.assign3;

public class Friend {
    private String name;
    private String studentNumber;
    private int friendCount;
    private int imageId;

    public Friend(String name, String studentNumber, int friendCount, int imageId) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.friendCount = friendCount;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public int getImageId() {
        return imageId;
    }
}
