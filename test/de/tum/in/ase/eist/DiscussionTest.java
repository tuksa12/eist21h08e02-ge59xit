package de.tum.in.ase.eist;

import org.easymock.EasyMock;
import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(EasyMockExtension.class)
public class DiscussionTest {

    // TODO implement the tests
    @TestSubject
    private Discussion discussion;

    @Mock
     private Course courseMock;

    @Mock
    private Comment commentMock;

    @Test
    public void testComment() {
        commentMock.save();
        discussion.getComments();
        courseMock.getNumberOfAttendees();
    }

    @Test
    public void testCommentIfSavingFails() {
    }

    @Test
    public void testStartCourseDiscussion() {

    }
}
