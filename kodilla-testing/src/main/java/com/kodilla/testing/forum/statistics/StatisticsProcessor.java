package com.kodilla.testing.forum.statistics;

public class StatisticsProcessor {

    int numberOfUsers = 0;
    int numberOfPosts = 0;
    int numberOfComments = 0;
    double avarageUsersNumberOfPosts = 0;
    double avarageUsersNumberOfComments = 0;
    double avaragePostsNumberOfComments = 0;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvarageUsersNumberOfPosts() {
        return avarageUsersNumberOfPosts;
    }

    public double getAvarageUsersNumberOfComments() {
        return avarageUsersNumberOfComments;
    }

    public double getAvaragePostsNumberOfComments() {
        return avaragePostsNumberOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {

            avarageUsersNumberOfPosts = (double) numberOfPosts / (double) numberOfUsers;
            avarageUsersNumberOfComments = (double) numberOfComments / (double) numberOfUsers;
        }
        if (numberOfPosts > 0) {

            avaragePostsNumberOfComments = (double) numberOfComments / (double) numberOfPosts;
        }

    }

    public void showStatistics() {

        System.out.println(" ");
        System.out.println("Number of users " + numberOfUsers);
        System.out.println("Number of posts " + numberOfPosts);
        System.out.println("Number of comments " + numberOfComments);
        System.out.println("Avarage number of Comments per one user " + avarageUsersNumberOfComments);
        System.out.println("Avarage number of Comments per one post " + avaragePostsNumberOfComments);
        System.out.println("Avarage number of Posts per one user " + avarageUsersNumberOfPosts);
        System.out.println(" ");

    }

}
