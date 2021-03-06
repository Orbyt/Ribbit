package orbyt.ribbit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private TabbedActivity mTabbedActivity;

    public SectionsPagerAdapter(TabbedActivity tabbedActivity, FragmentManager fm) {
        super(fm);
        mTabbedActivity = tabbedActivity;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return TabbedActivity.PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mTabbedActivity.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return mTabbedActivity.getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return mTabbedActivity.getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }
}
