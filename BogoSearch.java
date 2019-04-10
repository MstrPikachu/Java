import java.security.SecureRandom;

/**
 * This class provides a probabalistic array searching algortithm.
 *
 * @author     6167656e74323431
 *
 * @version    1.0
 */
public final class BogoSearch
{

	/**
	 * Private default constructor to prevent instance of the BogoSearch class
	 * being created
	 */
	private BogoSearch()
	{
	}

	/**
	 * A probabalistic function to see if a comparable objecct exists within an
	 * array of comparable objects. The object equality is checked via
	 * <code>.compareTo() == 0</code>
	 *
	 * @param      haystack  An array of comparable objects for this searching
	 *                       method to search through
	 * @param      needle    The object that is trying to be found in the
	 *                       haystack
	 *
	 * @return     Returns true if the needle exists within the haystack, false
	 *             if the needle is probably not in the haystack
	 *
	 * @throws     NullPointerException  If either the needle, or the haystack are
	 *                                   equal to null
	 */
	public static boolean searchComparableArray(Comparable[] haystack, Comparable needle)
	{
		if (haystack[(new SecureRandom()).nextInt(haystack.length)].compareTo(needle) == 0)
			return true;
		try
		{
			return searchComparableArray(haystack, needle);
		}
		catch (StackOverflowError e)
		{
		}
		return false;
	}
}