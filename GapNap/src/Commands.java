import java.util.ArrayList;

class Commands {

	static ArrayList<Command> commands;

	Commands() {
		
		//verbs for chapnat
		
		commands.add(new Command() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				return "getP"; // get profile picture
			}
		});
		commands.add(new Command() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				return "send"; // send message
			}
		});
		commands.add(new Command() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				return "chon"; // check online
			}
		});
		
		// verbs for database
		
		commands.add(new Command() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				return "sgup"; // signup
			}
		});
		commands.add(new Command() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				return "sgin"; // signin
			}
		});
		commands.add(new Command() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

			@Override
			public String getName() {
				return "newg"; // new Group
			}
		});

	}
}