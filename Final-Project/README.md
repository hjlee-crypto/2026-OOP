# 2026 객체지향프로그래밍 기말 팀 프로젝트

## 1. 프로젝트 제출 안내

객체지향프로그래밍 교과목의 기말 팀 프로젝트 결과물을 제출하는 공간입니다.

- 개발 언어: Java 또는 Kotlin
- 제출 단위: 팀별 제출(팀 대표 1명)
- 제출 방법: Fork & Pull Request
- 제출 위치: 소속 분반의 팀별 폴더

## 2. 제출 폴더 구조

```text
2026-OOP/
└── Final-Project/
    ├── README.md
    ├── A-Class/
    │   ├── README.md
    │   ├── Team01/
    │   ├── Team02/
    │   └── ...
    └── B-Class/
        ├── README.md
        ├── Team01/
        ├── Team02/
        └── ...
```

A-Class와 B-Class 폴더는 사전에 생성되어 있습니다.

**각 팀은 소속 분반의 폴더에 지정된 팀 번호로 팀별 폴더를 직접 생성하고 프로젝트 결과물을 업로드합니다.**

- A반 1팀: `Final-Project/A-Class/Team01/`
- B반 2팀: `Final-Project/B-Class/Team02/`

## 3. 팀별 프로젝트 구성

각 팀은 개발 과정에서 구성한 **기존 프로젝트의 폴더 구조를 그대로 유지하여 제출합니다.**

다음은 팀별 프로젝트 폴더 구성의 예시이며, 반드시 동일한 구조로 작성할 필요는 없습니다.

### 프로젝트 폴더 구성 예시

```text
Team01/
├── README.md
├── src/
├── docs/
├── tests/
└── 빌드 설정 파일(해당 시)
```

| 구성 항목(예시) | 주요 내용 |
|---|---|
| README.md | 프로젝트 소개, 주요 기능, 팀원 역할, 폴더 구조 및 실행 방법 |
| src | 전체 프로그램 소스 코드 |
| docs | UML 클래스 다이어그램 및 객체지향 설계 자료 |
| tests | 테스트 코드 또는 테스트 수행 결과 |
| AI 활용 기록 | 생성형 AI 활용 및 생성 코드 검토·수정 내역 |
| 빌드 설정 파일 | 프로젝트 실행에 필요한 설정 파일 |

개발 언어, 개발 환경 및 프로젝트 특성에 따라 폴더명과 구조는 달라질 수 있습니다.

단, 프로그램 실행에 필요한 전체 파일을 포함해야 하며, 실제 프로젝트의 폴더 구조와 실행 방법을 README.md에 명확하게 작성합니다.

## 4. 팀별 README.md 작성 항목

- 프로젝트명 및 개발 목적
- 팀원 구성 및 역할
- 주요 기능
- 개발 언어 및 개발 환경
- 객체지향 설계 구조
- 실제 프로젝트 폴더 구조 및 주요 클래스 설명
- 프로그램 실행 방법
- 테스트 수행 결과
- 생성형 AI 활용 및 코드 검토·수정 내역

## 5. 팀별 제출 및 협업 안내

- 모든 팀원은 프로그램 개발에 참여하며, GitHub를 활용하여 코드 작성 및 수정 이력을 관리합니다.
- 팀 대표는 팀원들이 개발한 프로그램을 통합하고, 최종 실행 및 테스트를 완료한 후 제출합니다.
- 팀 대표는 전체 소스 코드와 관련 자료를 정리하여 지정된 분반의 팀별 폴더에 업로드하고 Pull Request를 생성합니다.
- 별도의 GitHub 저장소에서 공동 개발을 진행한 경우, 해당 저장소의 URL을 팀별 README.md에 명시합니다. 비공개 저장소인 경우 교수자에게 열람 권한을 부여합니다.
- 팀원별 역할과 개발 참여 내역을 팀별 README.md에 명확하게 작성합니다.


## 6. GitHub 제출 방법

다음 제출 절차는 **팀 대표 1명**이 수행합니다.

1. 교수자의 GitHub 저장소에 접속합니다.
   - [https://github.com/hjlee-crypto/2026-OOP](https://github.com/hjlee-crypto/2026-OOP)
2. 우측 상단의 **Fork**를 클릭하여 자신의 GitHub 저장소로 복제합니다.
3. 자신의 Fork 저장소에서 `Final-Project` 폴더의 소속 분반 폴더로 이동합니다.
4. 지정된 팀 번호로 팀별 폴더를 직접 생성합니다.
5. 생성한 팀별 폴더에 기존 프로젝트 구조를 유지하여 전체 소스 코드 및 관련 자료를 업로드합니다.
6. **Commit changes**를 진행합니다.
7. 교수자의 `hjlee-crypto/2026-OOP` 저장소의 `main` 브랜치를 대상으로 **Pull Request**를 생성합니다.
8. Pull Request의 **Files changed**에서 제출한 파일과 변경 내용을 최종 확인합니다.

### Pull Request 제목 작성 형식

```text
[A-Class][Team01] 프로젝트명
[B-Class][Team02] 프로젝트명
```

## Fork & Pull Request 제출 방법 

팀별 프로그램 개발과 테스트를 완료한 후 최종 결과물을 정리하여 제출합니다.

### 전체 제출 절차

```text
교수자 GitHub 저장소 접속
         ↓
Fork (자신의 저장소로 복제)
         ↓
소속 분반 폴더 확인
         ↓
팀별 폴더 생성
         ↓
프로젝트 파일 업로드
         ↓
Commit changes
         ↓
Pull Request 생성
         ↓
제출 내용 및 제출 완료 확인
```

### STEP 1. 교수자 GitHub 저장소 접속

1. 자신의 GitHub 계정으로 로그인합니다.
2. 다음 교수자의 GitHub 저장소에 접속합니다.
   - [https://github.com/hjlee-crypto/2026-OOP](https://github.com/hjlee-crypto/2026-OOP)
3. 저장소 이름이 `hjlee-crypto/2026-OOP`인지 확인합니다.

### STEP 2. Fork — 자신의 GitHub 저장소로 복제

Fork는 다른 사용자의 GitHub 저장소를 자신의 계정으로 복제하는 기능입니다.

1. 교수자의 GitHub 저장소 우측 상단에 있는 **Fork** 버튼을 클릭합니다.
2. `Create a new fork` 화면에서 다음 항목을 확인합니다.

   | 설정 항목 | 설정 내용 |
   |---|---|
   | Owner | 자신의 GitHub 계정 |
   | Repository name | 2026-OOP |
   | Copy the main branch only | 체크 상태 유지 |

3. **Create fork** 버튼을 클릭합니다.
4. 자신의 GitHub 계정에 `2026-OOP` 저장소가 생성되었는지 확인합니다.

```text
교수자 원본 저장소
hjlee-crypto/2026-OOP

자신의 Fork 저장소
자신의GitHubID/2026-OOP
```

이미 Fork한 저장소가 있는 경우 다시 Fork할 필요는 없습니다. 기존 Fork 저장소의 `Sync fork`를 이용하여 교수자의 최신 변경 사항을 반영합니다.

단, 충돌이 발생한 경우 기존 작업 내용을 확인한 후 해결해야 합니다.

**이후 파일 생성 및 업로드 작업은 반드시 자신의 Fork 저장소에서 진행합니다.**

### STEP 3. 소속 분반 폴더로 이동

자신의 Fork 저장소에서 `Code` 탭을 선택하고 `Final-Project` 폴더로 이동합니다.

소속 분반에 해당하는 폴더를 선택합니다.

- A반: `Final-Project/A-Class/`
- B반: `Final-Project/B-Class/`

### STEP 4. 팀별 폴더 생성

GitHub에서는 빈 폴더만 생성할 수 없으므로 파일을 생성하면서 폴더를 함께 생성합니다.

1. 소속 분반 폴더에서 **Add file** 버튼을 클릭합니다.
2. **Create new file**을 선택합니다.
3. 파일명 입력란에 지정된 팀 번호와 README.md 파일명을 입력합니다.

   예시: 1팀인 경우

   ```text
   Team01/README.md
   ```

   예시: 2팀인 경우

   ```text
   Team02/README.md
   ```

4. README.md 편집 영역에 팀별 프로젝트 소개 및 관련 내용을 작성합니다.
5. 우측 상단의 **Commit changes...** 버튼을 클릭합니다.
6. Commit message를 작성합니다.

   ```text
   Create Team01 project folder and README
   ```

7. `Commit directly to the main branch`를 선택합니다.
8. **Commit changes** 버튼을 클릭합니다.
9. 해당 분반 폴더에 팀별 폴더가 생성되었는지 확인합니다.

### STEP 5. 프로젝트 파일 업로드

1. 자신의 Fork 저장소에서 생성한 팀별 폴더로 이동합니다.

   예시: A반 1팀

   ```text
   Final-Project/A-Class/Team01/
   ```

2. **Add file** 버튼을 클릭합니다.
3. **Upload files**를 선택합니다.
4. 자신의 컴퓨터에 저장된 최종 프로젝트 파일 및 하위 폴더를 업로드 영역으로 드래그합니다.
5. 업로드할 파일 목록과 폴더 구조를 확인합니다.

   - 전체 Java 또는 Kotlin 소스 코드
   - 프로젝트 실행에 필요한 설정 파일 및 리소스
   - UML 및 객체지향 설계 자료
   - 테스트 코드 또는 테스트 결과
   - 생성형 AI 활용 기록
   - 팀별 README.md

각 팀은 기존에 개발한 프로젝트의 내부 폴더 구조를 그대로 유지합니다.

프로젝트 전체를 ZIP 파일로만 제출하지 않으며, GitHub에서 소스 코드와 폴더 구조를 직접 확인할 수 있도록 업로드합니다.

**주의 사항**

- 팀별 폴더 내부에만 파일을 업로드합니다.
- 다른 팀의 폴더 및 기존 강의자료를 수정하지 않습니다.
- API Key, 비밀번호, 개인정보 등은 업로드하지 않습니다.
- 컴파일 결과물, 캐시 파일 등 불필요한 파일은 제외합니다.
- 웹 브라우저 업로드는 파일당 25MiB, 한 번에 최대 100개 파일로 제한됩니다. 이를 초과하는 경우 나누어 업로드하거나 Git 명령어 또는 GitHub Desktop을 활용합니다.

### STEP 6. Commit — 업로드 내용 저장

Commit은 파일의 추가, 수정 및 삭제 내역을 Git 저장소에 기록하는 작업입니다.

1. 파일 업로드가 완료되면 Commit message를 작성합니다.

   예시: A반 1팀

   ```text
   Add A-Class Team01 final project
   ```

2. `Commit directly to the main branch`를 선택합니다.
3. **Commit changes** 버튼을 클릭합니다.
4. 팀별 폴더에서 전체 프로젝트 파일이 정상적으로 등록되었는지 확인합니다.
5. README.md 및 주요 소스 코드가 정상적으로 열리는지 확인합니다.

**이 단계까지는 자신의 Fork 저장소에 프로그램을 업로드한 상태이며, 교수자에게 제출한 상태는 아닙니다.**

### STEP 7. Pull Request 생성 — 교수자 저장소에 제출

Pull Request(PR)는 자신의 Fork 저장소에서 작업한 내용을 원본 저장소에 반영해 달라고 요청하는 기능입니다.

1. 교수자의 원본 저장소에 접속합니다.
   - [https://github.com/hjlee-crypto/2026-OOP](https://github.com/hjlee-crypto/2026-OOP)
2. 상단의 **Pull requests** 탭을 선택합니다.
3. **New pull request** 버튼을 클릭합니다.
4. **compare across forks**를 클릭합니다.
5. 원본 저장소와 자신의 Fork 저장소를 다음과 같이 설정합니다.

   | 설정 항목 | 설정값 |
   |---|---|
   | base repository | hjlee-crypto/2026-OOP |
   | base | main |
   | head repository | 자신의GitHubID/2026-OOP |
   | compare | main |

   ```text
   교수자 저장소 ← 학생의 Fork 저장소

   base repository: hjlee-crypto/2026-OOP
   base: main

   head repository: 자신의GitHubID/2026-OOP
   compare: main
   ```

6. 변경된 파일 목록을 확인합니다.
7. 자신의 팀별 프로젝트 파일만 포함되어 있는지 확인합니다.
8. **Create pull request** 버튼을 클릭합니다.

### STEP 8. Pull Request 제목 및 제출 내용 작성

Pull Request 제목은 다음 형식으로 작성합니다.

**제목 작성 형식**

```text
[분반][팀번호] 프로젝트명
```

**제목 작성 예시**

```text
[A-Class][Team01] 도서 관리 시스템
[B-Class][Team02] 은행 계좌 관리 프로그램
```

**Description 작성 형식**

```text
분반:
팀 번호:
프로젝트명:
팀 대표:
개발 언어: Java 또는 Kotlin

주요 기능:
-

프로그램 실행 및 테스트 결과:
-

공동 개발 GitHub 저장소 URL(해당 시):
-
```

제목과 내용을 작성한 후 **Create pull request** 버튼을 클릭하여 제출합니다.

### STEP 9. 제출 완료 확인

1. 교수자의 GitHub 저장소에 접속합니다.
2. **Pull requests** 탭을 선택합니다.
3. 자신이 생성한 Pull Request가 목록에 표시되는지 확인합니다.
4. 해당 Pull Request를 선택합니다.
5. 다음 항목을 확인합니다.

   | 확인 항목 | 확인 내용 |
   |---|---|
   | Conversation | 제출 제목 및 제출 내용 |
   | Commits | 제출된 Commit 이력 |
   | Files changed | 제출 파일 및 변경된 소스 코드 |
   | PR 상태 | Open 또는 Merged |

6. 제출한 Pull Request의 URL을 확인하고 보관합니다.

**Pull Request가 정상적으로 생성되면 제출이 완료된 것입니다.**

교수자가 제출 내용을 확인한 후 Merge를 진행하므로 학생은 별도의 Merge 작업을 수행하지 않습니다.

### STEP 10. 제출 후 수정이 필요한 경우

Pull Request를 제출한 후 교수자가 수정 또는 보완을 요청한 경우 다음과 같이 진행합니다.

1. 자신의 Fork 저장소로 이동합니다.
2. 해당 팀별 프로젝트 파일을 수정합니다.
3. 수정한 파일을 업로드하거나 편집합니다.
4. 수정 내용을 Commit합니다.
5. 기존 Pull Request의 `Commits` 및 `Files changed`에서 변경 사항이 반영되었는지 확인합니다.

기존 Pull Request가 Open 상태라면 동일한 제출 브랜치에 추가한 Commit이 자동으로 반영되므로 새로운 Pull Request를 생성할 필요가 없습니다.

교수자가 이미 Merge한 이후 추가 수정이 필요한 경우에는 별도의 Pull Request를 생성합니다.

---

### GitHub 공식 참고 자료

- [Fork a repository](https://docs.github.com/en/pull-requests/how-tos/work-with-forks/fork-a-repo)
- [Creating new files](https://docs.github.com/en/repositories/working-with-files/managing-files/creating-new-files)
- [Adding a file to a repository](https://docs.github.com/en/repositories/working-with-files/managing-files/adding-a-file-to-a-repository)
- [Creating a pull request from a fork](https://docs.github.com/en/pull-requests/how-tos/create-pull-requests/creating-a-pull-request-from-a-fork)




   



## 7. 제출 전 확인 사항

- [ ] 소속 분반 및 팀 번호가 정확한가?
- [ ] 기존 프로젝트의 폴더 구조가 유지되어 있는가?
- [ ] 전체 소스 코드 및 실행에 필요한 파일이 포함되어 있는가?
- [ ] README.md에 실제 프로젝트 폴더 구조와 실행 방법이 명시되어 있는가?
- [ ] 팀원별 역할 및 개발 참여 내역이 작성되어 있는가?
- [ ] 별도의 공동 개발 GitHub 저장소를 사용한 경우 해당 URL이 명시되어 있는가?
- [ ] 공동 개발 저장소가 비공개인 경우 교수자에게 열람 권한을 부여했는가?
- [ ] 객체지향 설계 자료가 포함되어 있는가?
- [ ] 프로그램이 정상적으로 실행되는가?
- [ ] 테스트 결과가 포함되어 있는가?
- [ ] 생성형 AI 활용 및 코드 검토·수정 내역이 작성되어 있는가?
- [ ] Pull Request가 정상적으로 생성되었는가?

## 8. 유의 사항

- 팀 대표 1명이 팀별 최종 결과물을 제출하며, 중복 제출하지 않습니다.
- 지정된 팀별 폴더 내부에만 프로젝트 결과물을 업로드합니다.
- 다른 팀의 프로젝트 및 기존 강의자료를 수정하거나 삭제하지 않습니다.
- 컴파일 결과물, 캐시 파일 등 불필요한 파일은 제출하지 않습니다.
- API Key, 비밀번호, 학번 등 개인정보 및 보안 관련 정보를 업로드하지 않습니다.
- 공동 개발에 사용한 GitHub 저장소와 팀원별 Commit 이력은 평가가 완료될 때까지 유지합니다.
- 생성형 AI 및 바이브코딩 활용은 허용합니다.
- 생성형 AI를 활용했더라도 객체지향 원리가 적용되지 않은 절차적 코드 구조는 객체지향 설계 평가에서 낮은 점수를 받을 수 있습니다.
- 모든 팀원은 자신이 참여한 프로젝트의 코드 구조, 객체지향 설계 및 주요 기능의 구현 방식을 설명할 수 있어야 합니다.
- Pull Request 생성까지 완료해야 제출한 것으로 인정합니다. 교수자의 Merge 여부는 제출 완료 기준과 무관합니다.
