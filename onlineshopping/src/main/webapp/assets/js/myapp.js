$(function(){
	 //solving the active menu problem
	switch(menu) {
		
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'View Products':
		$('#listproduct').addClass('active');
		break;
	default:
		$('#home').addClass('active');
	    break;
		
	}
	
});