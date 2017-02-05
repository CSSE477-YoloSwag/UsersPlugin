package servlet;

public class UsersServletManager extends AServletManager {
	
	public UsersServletManager(String filePath, ClassLoader loader) {
		super(filePath, loader);
		// nothing to do 
	}

	@Override
	public void init() {
		//nothing to do
	}

	@Override
	public void destroy() {
		for(AHttpServlet servlet : servletMap.values()) {
			servlet.destroy();
		}
	}
}
