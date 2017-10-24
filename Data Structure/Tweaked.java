package datastructure;

public class Tweaked {
	public boolean isTweakedIdentical(TreeNode one, TreeNode two) {
		if (one == null && two == null) {
			return true;
		}
		if (one == null || two == null) {
			return false;
		}
		if (one.key != two.key) {
			return false;
		}
		return (isTweakedIdentical(one.left, two.left) && 
				isTweakedIdentical(one.right, two.right)) ||
				(isTweakedIdentical(one.left, two.right) &&
						isTweakedIdentical(one.right, two.left));
		// typo should be avoid!
	}
}
