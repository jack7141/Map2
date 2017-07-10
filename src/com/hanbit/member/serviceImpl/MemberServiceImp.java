package com.hanbit.member.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hanbit.member.domain.MemberBean;
import com.hanbit.member.service.MemberService;

public class MemberServiceImp implements MemberService {
	MemberBean member;
	Map<String,MemberBean> map;
	public MemberServiceImp() {
		map= new HashMap<>();

	}

	@Override
	public void addMember(MemberBean member) {
		map.put(member.getId(),member);

	}

	@Override
	public List<MemberBean> getMembers() {
		List<MemberBean> list=new ArrayList<>();
		Set<String>keys=map.keySet();
		for(String s:keys){
				list.add(map.get(s));
		}
		return list;

	}

	@Override
	public int countMembers() {
		return map.size();
	}

	@Override
	public MemberBean findById(String id) {
		return map.get(id);
			}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean>temp=new ArrayList<>();
		if(name.equals(map.get(getName()))){
				Set<String>temps=map.keySet();
				for(String t: temps){
					temp.add(map.get(t));
				}
		}
		/*Set<String> names=map.keySet();
		for(String n:names){
			temp.add(map.get(n));
		*/
		return temp;
		
			
	}
	

	private Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePass(MemberBean bean) {
		// 아이디 패스워드 주민등록번호까지 바꿔봐라~
		MemberBean member = new MemberBean();
		member.setSsn(bean.getSsn());
	}

	@Override
	public void deleteMember(String id) {
				map.remove(id);
			}
		
	}

