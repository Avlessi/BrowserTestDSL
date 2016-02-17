webBrowser firefox
	open
		onglet : "http://campus.mines-nantes.fr"
		if (textField "username isEmpty)		
			do something ...
		else
			clear textField "usernem"
		
	close