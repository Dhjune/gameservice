package com.mdream.lyservices.model.base.slide;

import java.util.List;

public class SlideShowObject {
	
	private String showid;
	
	private String showtype;
	
	private String showicon;
	
	private List<SlideObject> slides;

	public String getShowid() {
		return showid;
	}

	public void setShowid(String showid) {
		this.showid = showid;
	}

	public String getShowtype() {
		return showtype;
	}

	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public String getShowicon() {
		return showicon;
	}

	public void setShowicon(String showicon) {
		this.showicon = showicon;
	}

	public List<SlideObject> getSlides() {
		return slides;
	}

	public void setSlides(List<SlideObject> slides) {
		this.slides = slides;
	}
	
	
	
	
}
