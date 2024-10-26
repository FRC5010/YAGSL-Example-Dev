package swervelib.encoders;

import swervelib.motors.SwerveMotor;
import swervelib.motors.ThriftyNovaSwerve;

/**
 * Thrifty Nova absolute encoder, attached through the data port.
 */
public class ThriftyNovaEncoderSwerve extends SwerveAbsoluteEncoder {
    /** The absolute encoder is directly interfaced through the Thrifty Nova motor. */
    protected ThriftyNovaSwerve motor;
   
    /**
     * Create the {@link ThriftyNovaEncoderSwerve} object as an absolute encoder from the {@link ThriftyNovaSwerve} motor.
     *
     * @param motor {@link SwerveMotor} through which to interface with the attached encoder .
     */
    public ThriftyNovaEncoderSwerve(SwerveMotor motor) {
        this.motor = (ThriftyNovaSwerve)motor;
        motor.setAbsoluteEncoder(null);
    }

    /**
     * Set factory default.
     */
    @Override
    public void factoryDefault() {
    }

    /**
     * Clear sticky faults.
     */
    @Override
    public void clearStickyFaults() {
    }

    /**
     * Configure the absolute encoder.
     *
     * @param inverted Whether the encoder is inverted.
     */
    @Override
    public void configure(boolean inverted) {
        motor.setInverted(inverted);
    }

    /**
     * Get the absolute position of the encoder.
     *
     * @return Absolute position in degrees from [0, 360).  
     */
    @Override
    public double getAbsolutePosition() {
        return motor.getPosition();
    }

    /**
     * Get the instantiated absolute encoder Object.
     */
    @Override
    public Object getAbsoluteEncoder() {
        return null;
    }

    /**
     * Set the absolute encoder offset.
     *
     * @param offset offset in degrees from [0, 360).
     * @return true if successful.
     */
    @Override
    public boolean setAbsoluteEncoderOffset(double offset) {
        return true;
    }

    /**
     * Get the absolute encoder velocity.
     * ** Currently unsupported
     * @return Velocity in degrees per second.
     */
    @Override
    public double getVelocity() {
//        return motor.getVelocity();
        throw new UnsupportedOperationException("Unimplemented method 'getVelocity'");
    }    
}
