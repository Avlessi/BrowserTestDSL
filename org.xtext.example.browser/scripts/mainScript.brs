webBrowser firefox
    	open
    		onglet : "http://campus.mines-nantes.fr"
			goToLink "Connexion"
			clickOnButton "Connexion"
			fillTextField "username" with "mtisi08"
			fillTextField "password" with "12345"
			selectCheckBox "warn"
			clickOnButton "Connexion"
			redirectTo "https://campusneo.mines-nantes.fr/campus/course/view.php?id=1571"
			checkIf "Massimo Tisi" isIn "Consulter profil"
			close				
			
		close