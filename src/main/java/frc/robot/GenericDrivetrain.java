package frc.robot;

/**
 * Generic interface for an FRC drivetrain
 * Drivetrains we create should likely implement this interface
 */
public interface GenericDrivetrain {
    /**
     * Drive the robot in a tank style
     * @param left The percent power for the left side of the drive base, in [-1.0, 1.0]
     * @param right The percent power for the right side of the drive base, in [-1.0, 1.0]
     */
    public void tankDrive(double left, double right);

    /**
     * Drive the robot in an arcade style
     * @param speed The percent speed for forward motion in [-1.0, 1.0]
     * @param turn The percent rotation speed from -1.0 to 1.0 where ccw turning is negative
     */
    public void arcadeDrive(double speed, double turn);
}
