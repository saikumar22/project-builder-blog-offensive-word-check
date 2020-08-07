package utility;
import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	//create array
	String[] array = {"assbag",
			"assbandit",
			"assbang",
			"assbanged",
			"assbanger",
			"assbangs",
			"assbite",
			"assclown",
			"asscock",
			"asscracker",
			"asses",
			"assface",
			"assfaces",
			"assfuck",
			"assfucker",
			"ass-fucker",
			"assfukka",
			"assgoblin",
			"assh0le",
			"asshat",
			"ass-hat",
			"asshead",
			"assho1e",
			"asshole",
			"assholes",
			"asshopper",
			"ass-jabber",
			"assjacker",
			"asslick",
			"asswipes"};
	int length = array.length;
	
	public boolean checkBlogTitle(Blog blog) {
//		System.out.println(length);
		//System.out.println(blog.getBlogTitle());
		// TODO Auto-generated method stub
		String title = blog.getBlogTitle();
		for(int i=0;i<length;i++) {
		
			if(array[i].equals(title)) {
				System.out.println("Inside checkblog");
				return true;
			}		
		}
		return false;
	}
	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++) {
			if(array[i].equals(blog.getBlogDescription())) {
			return false;
			}						
		}
		return true;
	}
	@Override
	public boolean checkBlog(Blog blog) {
		
		if(checkBlogTitle(blog) && checkBlogDescription(blog)) {
			return false;
		}
		else {
		return true;
		}
	}
}