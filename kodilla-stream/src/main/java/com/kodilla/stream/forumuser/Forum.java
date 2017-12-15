package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.YEARS;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<ForumUser>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "charlie", 'F', LocalDate.of(1990, 12, 2), 25));
        theForumUserList.add(new ForumUser(2, "charlie999", 'M', LocalDate.of(1996, 12, 2), 0));
        theForumUserList.add(new ForumUser(3, "charlie111", 'M', LocalDate.of(1998, 12, 2), 1));
        theForumUserList.add(new ForumUser(4, "charlieCharlie", 'M', LocalDate.of(1997, 12, 1), 2));
        theForumUserList.add(new ForumUser(5, "charlieee", 'F', LocalDate.of(1997, 12, 17), 25));
        theForumUserList.add(new ForumUser(6, "charlie999ee", 'M', LocalDate.of(1997, 12, 14), 7));
        theForumUserList.add(new ForumUser(7, "charlie111ee", 'M', LocalDate.of(1997, 12, 16), 1));
        theForumUserList.add(new ForumUser(8, "charlieCharlieeee ", 'M', LocalDate.of(1997, 12, 15), 5));

    }

    public List<ForumUser> getTheForumUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
