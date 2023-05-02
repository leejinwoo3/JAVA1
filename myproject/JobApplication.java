package myproject;

import java.util.ArrayList;
import java.util.Scanner;

import quiz.Account;

public class JobApplication {
	private static ArrayList<Job> jobList = new ArrayList<>();
	private static Job[] jobArray = new Job[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Job jobbae = new Job(1, "배철수");
		Job joban = new Job(2, "안철수");

		Job jobBe = new Warrior(3, "헤라클래스", 300, 300);
		Job jobas = new Warrior(4, "아레스", 400, 400);

		Job jobga = new Wizard(5, "해리포터", 80000, 300);
		Job jobex = new Wizard(6, "간달프", 1200000, 600);

		Job jobre = new Archer(7, "레골라스", 140, 200, 100);
		Job jobgo = new Archer(8, "주몽", 160, 300, 100);

		jobList.add(jobbae);
		jobList.add(joban);
		jobList.add(jobBe);
		jobList.add(jobas);
		jobList.add(jobga);
		jobList.add(jobex);
		jobList.add(jobre);
		jobList.add(jobgo);

		showAllJob();

		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.인물선택 | 2.인물선택목록");

			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				Characterselection();
				break;
			case 2:
				Characterlist();
				break;

			default:
				System.out.println("1~2사이의 숫자를 입력해주세요");
				break;
			}

		}

	}

	private static void Characterselection() {
		System.out.println("--------");
		System.out.println("케릭터 선택");
		System.out.println("--------");

		System.out.println("캐릭터ID :");
		int jobID = scanner.nextInt();

		System.out.println("캐릭터이름 :");
		String jobName = scanner.next();

		Job newjob = new Job(jobID, jobName);

//		jobList.add(newjob);

		for (int i = 0; i < jobArray.length; i++) {

			if (jobArray[i] == null) {
				jobArray[i] = newjob;
				System.out.println("결과: 케릭터가 선택되었습니다.");
				break;
			}
		}

	}

	private static void Characterlist() {
		System.out.println("-----------");
		System.out.println("케릭터목록");
		System.out.println("-----------");

		for (Job job : jobArray) {
			if (job != null) {
				System.out.print(job.getJobID());
				System.out.print(" ");
				System.out.print(job.getJobName());
				System.out.print(" ");
				System.out.println();
			}
		}

	}

	private static void showAllJob() {
		// TODO Auto-generated method stub
		System.out.println("============== 인물 직업 정보=============");
		for (Job job : jobList) {
			System.out.println(job.showJobInfo());
		}
		System.out.println("================= 선택창 ================");

	}
}
