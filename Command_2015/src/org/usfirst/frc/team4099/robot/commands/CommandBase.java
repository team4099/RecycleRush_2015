import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	public static OI oi;
	public static DriveTrain driveTrain = new DriveTrain();
	public static Elevator elevator = new Elevator();
	public static void init() {
		public static oi = new OI();
	}
	
	public CommandBase(String name) {
		super(name);
	}
	
	public CommandBase() {
		super();
	}
}
