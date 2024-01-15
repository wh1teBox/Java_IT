package Lessons.Lesson34.Behavioral.State.src;

interface BaseState {
	void Handle(Context context);
	String GetNameOfState();
}
