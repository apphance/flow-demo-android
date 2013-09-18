package com.apphance.flow.android;

import android.widget.Button;
import android.widget.TextView;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

/**
 * @author Mateusz Grzechociński <mateusz.grzechocinski@gmail.com>
 */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private MainActivity activity;

    private Button button;

    private TextView invitationTextView;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(MainActivity.class).create().get();
        button = (Button) activity.findViewById(R.id.btnInvitation);
        invitationTextView = (TextView) activity.findViewById(R.id.tvResult);
    }

    @Test
    public void shouldInvitationBeBlankWhenButtonNotClicked() throws Exception {
        //given

        //when

        //then
        Assertions.assertThat(invitationTextView.getText()).isEmpty();
    }

    @Test
    public void shouldShowInvitationWhenButtonClicked() throws Exception {
        //given

        //when
        button.performClick();

        //then
        Assertions.assertThat(invitationTextView.getText()).isEqualTo("Hello!");
    }
}
